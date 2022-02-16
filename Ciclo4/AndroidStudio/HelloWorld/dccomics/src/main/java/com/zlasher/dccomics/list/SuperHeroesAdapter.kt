package com.zlasher.dccomics.list

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.zlasher.dccomics.R
import com.zlasher.dccomics.model.SuperheroeItem

class SuperHeroesAdapter(
    private val superheroeList: ArrayList<SuperheroeItem>,
    private val onItemClicked: (SuperheroeItem) -> Unit
) : RecyclerView.Adapter<SuperHeroesAdapter.SuperheroeViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperheroeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view_superheroe_item, parent, false)
        return SuperheroeViewHolder(view)
    }

    override fun onBindViewHolder(holder: SuperheroeViewHolder, position: Int) {
        val superheroe = superheroeList[position]
        holder.itemView.setOnClickListener { onItemClicked(superheroeList[position]) }
        holder.bind(superheroe)
    }

    override fun getItemCount(): Int = superheroeList.size


    class SuperheroeViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {

        private var nameTextView: TextView = itemview.findViewById(R.id.name_text_view)
        private var aliasTextView: TextView = itemview.findViewById(R.id.alias_text_view)
        private var pictureImageView: ImageView = itemview.findViewById(R.id.picture_image_view)

        fun bind(superheroe: SuperheroeItem) {
            Log.d("nombre", superheroe.name)
            nameTextView.text = superheroe.name
            aliasTextView.text = superheroe.alias
            Picasso.get().load(superheroe.urlPicture).into(pictureImageView)

        }
    }
}