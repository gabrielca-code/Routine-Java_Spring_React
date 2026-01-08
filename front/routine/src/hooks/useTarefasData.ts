import axios, { type AxiosPromise } from "axios"
import type { TarefaData } from "../interface/tarefaData"

const API_URL = 'http://localhost:8080'

const fetchData = async (): AxiosPromise<TarefaData[]> => {
    const response = axios.get(API_URL + "/tarefa")
    return response
}

export function useTarefaData() {
    
}