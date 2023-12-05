package com.example.mainrover

import com.example.mainrover.domain.model.RoverManifestUiModel
import com.example.mainrover.domain.model.RoverManifestUiState
import com.example.mainrover.domain.model.toUiModel
import com.example.mainrover.service.model.ManifestPhotoRemoteModel
import com.example.mainrover.service.model.PhotoManifestRemoteModel
import com.example.mainrover.service.model.RoverManifestRemoteModel
import org.junit.Test

import org.junit.Assert.*


class RoverManifestConvertorTest {
    @Test
    fun `should convert roverManifestModel to RoverManifestUiState`() {
        //Given
        val roverManifestRemoteModel = RoverManifestRemoteModel(
            photoManifest = PhotoManifestRemoteModel(
                landigDate = "2021-02-18",
                launchDate = "2020-07-30",
                maxDate = "2023-05-19",
                maxSol = "799",
                name = "Perseverance",
                photos = listOf(
                    ManifestPhotoRemoteModel(
                        cameras = listOf("REAR_HAZCAM_LEFT","REAR_HAZCAM_RIGHT"),
                        earthDate = "2021-02-18",
                        sol = 0,
                        totalPhotos = 54
                    )
                ),
                status = "active",
                totalPhotos = 156687
            )
        )

        //When
        val result = toUiModel(roverManifestRemoteModel)

        //Then
        val expectedResult = RoverManifestUiState.Success(
            listOf(
                RoverManifestUiModel(
                    sol = "0",
                    earthDate = "2021-02-18",
                    photoNumber = "54"
                )
            )
        )
        assertEquals(expectedResult, result)




    }
}