package com.example.mainrover.domain.model

import com.example.mainrover.db.MarsRoverSavedLocalModel

//class RoverPhotoConvertor {
//}
fun toDbModel(roverPhotoUiModel: RoverPhotoUiModel): MarsRoverSavedLocalModel =
    MarsRoverSavedLocalModel(
        roverPhotoId = roverPhotoUiModel.id,
        roverName = roverPhotoUiModel.roverName,
        imgSrc = roverPhotoUiModel.imgSrc,
        sol = roverPhotoUiModel.sol,
        earthDate = roverPhotoUiModel.earthDate,
        cameraFullName = roverPhotoUiModel.cameraFullName
    )