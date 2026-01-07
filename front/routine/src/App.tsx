//import { useState } from 'react'
//import reactLogo from './assets/react.svg'
//import viteLogo from '/vite.svg'
import './App.css'
import { Card } from './components/card/card';
import type { TarefaData } from './interface/tarefaData';

function App() {
  const tarefaData: TarefaData[] = [];

  return (
    <div className='container'>
      <h1>Tarefas</h1>
      <div className='card-grid'>
        {tarefaData.map(tarefa => <Card id={tarefa.id} titulo={tarefa.titulo} descricao={tarefa.descricao}/>)}
      </div>
    </div>
  )
}

export default App
