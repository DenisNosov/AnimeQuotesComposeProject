package com.example.mappers

interface Mapper<Source, Target> {
    fun map(src: Source): Target
}