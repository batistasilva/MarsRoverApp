package com.example.mainrover.domain.model

import com.example.mainrover.service.model.RoverManifestRemoteModel

//class RoverManifestConvertor {
//}
fun toUiModel(roverManifestRemoteModel: RoverManifestRemoteModel) : RoverManifestUiState = RoverManifestUiState.Success(roverManifestRemoteModel.photoManifest.photos.map { photo ->
    RoverManifestUiModel(
        sol = photo.sol.toString(),
        earthDate = photo.earthDate,
        photoNumber = photo.totalPhotos.toString()
    )
})