package com.a_ches.mvvm.model.repository



interface Repository<T> {

    suspend fun getData(word: String): T

}