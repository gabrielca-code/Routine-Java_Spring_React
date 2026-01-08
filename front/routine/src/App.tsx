import './App.css'
import { Card } from './components/card/card';
import { useTarefaData } from './hooks/useTarefasData';

function App() {
  const { data } = useTarefaData();

  return (
    <div className='container'>
      <h1>Tarefas</h1>
      <div className='card-grid'>
        {data?.map(tarefa => <Card id={tarefa.id} titulo={tarefa.titulo} descricao={tarefa.descricao}/>)}
      </div>
    </div>
  )
}

export default App
