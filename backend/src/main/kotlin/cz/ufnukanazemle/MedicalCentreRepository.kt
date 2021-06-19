package cz.ufnukanazemle.be

import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.r2dbc.annotation.R2dbcRepository
import io.micronaut.data.repository.reactive.ReactiveStreamsCrudRepository
import reactor.core.publisher.Flux


@R2dbcRepository(dialect = Dialect.MYSQL)
interface MedicalCentreRepository: ReactiveStreamsCrudRepository<MedicalCentre, Long> {
    abstract override fun findAll() : Flux<MedicalCentre>
}