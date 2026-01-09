package kr.ac.kumoh.s20260000.spring05thymeleaf.repository

import kr.ac.kumoh.s20260000.spring05thymeleaf.model.Song
import org.springframework.stereotype.Repository

@Repository
class SongRepository {
    private val songs = listOf(
        Song(1, "Golden", "HUNTR/X"),
        Song(2, "Blue Valentine", "NMIXX"),
        Song(3, "타임캡슐", "다비치"),
    )

    /**
     * Repository: 모든 노래 리스트 얻음
     */
    fun findAll() = songs.toList()

    fun findById(id: Int): Song? {
        return songs.find { it.id == id }
    }

    fun count() = songs.size
}