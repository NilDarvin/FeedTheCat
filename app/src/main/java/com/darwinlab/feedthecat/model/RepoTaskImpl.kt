package com.darwinlab.feedthecat.model

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class RepoTaskImpl : RepoTask {
    override suspend fun refreshData(status: Int): String {
        return withContext(Dispatchers.IO) {
            return@withContext "newTask$status"
        }
    }
}