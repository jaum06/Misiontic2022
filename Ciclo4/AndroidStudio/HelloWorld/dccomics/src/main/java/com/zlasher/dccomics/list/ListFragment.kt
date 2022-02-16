package com.zlasher.dccomics.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.Gson
import com.zlasher.dccomics.databinding.FragmentListBinding
import com.zlasher.dccomics.model.Superheroe
import com.zlasher.dccomics.model.SuperheroeItem

class ListFragment : Fragment() {

    private lateinit var listBinding: FragmentListBinding
    private lateinit var superHeroesAdapter: SuperHeroesAdapter
    private lateinit var listSuperheroes: ArrayList<SuperheroeItem>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        listBinding = FragmentListBinding.inflate(inflater, container, false)

        return listBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listSuperheroes = loadMockSuperHeroesFromJson()
        superHeroesAdapter =
            SuperHeroesAdapter(listSuperheroes, onItemClicked = { onSuperHeroreClicked(it) })

        listBinding.superheroesRecyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = superHeroesAdapter
            setHasFixedSize(false)
        }
    }

    private fun onSuperHeroreClicked(superheroe: SuperheroeItem) {
        findNavController().navigate(ListFragmentDirections.actionListFragmentToDetailFragment(superheroe))
    }

    private fun loadMockSuperHeroesFromJson(): ArrayList<SuperheroeItem> {
        val superHeroesString: String = context?.assets?.open("superheroes.json")?.bufferedReader()
            .use { it!!.readText() } //TODO reparar!!!
        val gson = Gson()
        val superHeroesList = gson.fromJson(superHeroesString, Superheroe::class.java)
        return superHeroesList
    }
}