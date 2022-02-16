// FC
export const Variables = () => {

    const saludar = "Hola como estas...!"
    const url = 'https://images.pexels.com/photos/6785291/pexels-photo-6785291.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260'
    return (
        <>
            <h2>{saludar}</h2>
            <img src={url} alt="bella chica" />
        </>
    )
}
