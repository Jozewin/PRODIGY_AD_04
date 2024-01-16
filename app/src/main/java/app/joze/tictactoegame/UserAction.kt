package app.joze.tictactoegame

sealed class UserAction {

    object PlayAgainClicked : UserAction()

    data class BoardTapped(val cellNo : Int ) : UserAction()
}