package com.dev_marinov.kinopoiskapp.domain.usecase

import com.dev_marinov.kinopoiskapp.domain.util.UseCase
import com.dev_marinov.kinopoiskapp.domain.model.Movie
import com.dev_marinov.kinopoiskapp.domain.repository.MovieRepository
import javax.inject.Inject

/**
 * UseCase for removing [Movie] from database
 */
class DeleteMovieUseCase @Inject constructor(
    private val movieRepository: MovieRepository
) : UseCase<DeleteMovieUseCase.DeleteMovieParams, Unit>() {

    override suspend fun execute(parameters: DeleteMovieParams) {
        movieRepository.deleteMovie(parameters.movie)
    }

    data class DeleteMovieParams(val movie: Movie)
}