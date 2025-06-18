package io.github.kevinah95.di

import androidx.lifecycle.viewmodel.compose.viewModel
import io.github.kevinah95.view_models.UserViewModel
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module
import repository.UserRepository
import repository.UserRepositoryImpl

val appModule = module {
    singleOf(::UserRepositoryImpl) { bind<UserRepository>() }
    viewModelOf(::UserViewModel)
}