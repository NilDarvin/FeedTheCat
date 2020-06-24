package com.darwinlab.feedthecat.model

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class RepoTask {
    /**
     *  Прототип репозитория.
     */
    suspend fun refreshData(status : Int) : String{
        return withContext(Dispatchers.IO) {
            return@withContext "newTask$status"
        }
    }
}