package com.darwinlab.feedthecat.model

interface RepoTask {
    suspend fun refreshData(status : Int) : String
}