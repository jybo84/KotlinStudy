package Lesson_22

/*
Задача 4 к Уроку 22

В разработке Android приложений часто используется паттерн MVVM (Model-View-ViewModel) для разделения бизнес-логики
и пользовательского интерфейса. ViewModel отвечает за управление состоянием приложения и хранит данные, которые
необходимы для отображения на экране.
Предположим, что у нас есть MainScreenViewModel первого экрана приложения, для инициализации которого подгружаются
данные с сервера. VM хранит единственное свойство mainScreenState.
ViewModel будет содержать внутренний data class MainScreenState для хранения стейта (состояния). Состояние экрана
включает два свойства: data (загружаемые данные - String) и isLoading (индикатор процесса загрузки, обычно имеет
значение по умолчанию false).

Создай data class для хранения состояния. При изменении состояния загрузки создается новый объект стейта, копируя
текущее состояние с изменением значения поля isLoading.
Сымитируй процесс загрузки данных с сервера в методе вью модели loadData(), в частности состояния:
- отсутствие данных;
- загрузка данных;
- наличие загруженных данных.
 */

fun main() {

}

class MainScreenViewModel {
    val mss = MainScreenState()

    fun loadData() {
        val mss = mss.copy(isLoading = true)
        println(mss)
    }

    fun loadDataEnd(dataInput: String) {
        val mss = mss.copy(data = dataInput)
        println(mss)
    }

    data class MainScreenState(
        val data: String? = null,
        val isLoading: Boolean = false
    )
}