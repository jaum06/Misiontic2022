import React from 'react'

export const Formulario = () => {

    const [comida, setComida] = React.useState('')
    const [descripcion, setdescripcion] = React.useState('')

    const handleComida = (e) => {
        console.log(e.target.value);
        setComida(e.target.value)
    }

    return (
        <div>
            <h2>Formulario</h2>
            <hr />

            <form>

                <input
                    type="text"
                    placeholder="Ingrese su comida"
                    className="form-control mb-2"
                    onChange={handleComida}
                />

                <input
                    type="text"
                    placeholder="Descripción de la comida"
                    className="form-control mb-2"
                />

                <button className="btn btn-outline-success">Adicionar Elemento</button>

            </form>

        </div>
    )
}
