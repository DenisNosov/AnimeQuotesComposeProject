package com.example.domain.usecase.base

abstract class UseCase<T> {
    abstract suspend operator fun invoke(): T
}

abstract class UseCaseWithParams<Param, Data> {
    abstract suspend operator fun invoke(params: Param): Data
}