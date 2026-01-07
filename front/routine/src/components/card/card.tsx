interface CardProps {
    id: number,
    titulo: string,
    descricao: string
}

export function Card({ titulo, descricao } : CardProps) {
    return(
        <div className="card">
            <h2>{titulo}</h2>
            <p>Descrição: {descricao}</p>
        </div>
    )
}