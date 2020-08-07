package com.agladkov.starcraftuniverse.ui.zerg

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.agladkov.starcraftuniverse.R

class ZergViewModel : ViewModel() {

    private val _unitData = MutableLiveData<List<ZergCellModel>>().apply {
        value = emptyList()
    }

    val unitData: LiveData<List<ZergCellModel>> = _unitData

    fun generateUnits() {
        val units: MutableList<ZergCellModel> = ArrayList()
        for (i in 0 until generateImages().count()) {
            units.add(
                ZergCellModel(
                    name = generateNames()[i], description = generateSubtitles()[i],
                    icon = generateImages()[i]
                )
            )
        }

        _unitData.postValue(units)
    }

    private fun generateImages(): List<Int> =
        ArrayList<Int>().apply {
            this.add(R.drawable.zerg_drone)
            this.add(R.drawable.zerg_overlord)
            this.add(R.drawable.zerg_overseer)
            this.add(R.drawable.zerg_queen)
            this.add(R.drawable.zerg_zergling)
            this.add(R.drawable.zerg_baneling)
            this.add(R.drawable.zerg_roach)
            this.add(R.drawable.zerg_ravager)
            this.add(R.drawable.zerg_hydralisk)
            this.add(R.drawable.zerg_lurker)
            this.add(R.drawable.zerg_swarm_host)
            this.add(R.drawable.zerg_infestor)
            this.add(R.drawable.zerg_ultralisk)
            this.add(R.drawable.zerg_mutalisk)
            this.add(R.drawable.zerg_corruptor)
            this.add(R.drawable.zerg_broodlord)
            this.add(R.drawable.zerg_viper)
        }

    private fun generateNames(): List<String> =
        ArrayList<String>().apply {
            this.add("Рабочий")
            this.add("Владыка")
            this.add("Надзиратель")
            this.add("Королева")
            this.add("Зерглинг")
            this.add("Гиблинг")
            this.add("Таракан")
            this.add("Разоритель")
            this.add("Гидралиск")
            this.add("Скрытень")
            this.add("Роевик")
            this.add("Заразитель")
            this.add("Ультралиск")
            this.add("Муталиск")
            this.add("Губитель")
            this.add("Хозяин стаи")
            this.add("Стрекоза")
        }

    private fun generateSubtitles(): List<String> =
        ArrayList<String>().apply {
            this.add("Рабочий зергов.")
            this.add("Летающий юнит, дающий снабжение (аналог пилона, саплая).")
            this.add("Не имеет атаки и используется только для разведки.")
            this.add("Юнит предназначенный для охраны ваших баз, этакий мазеркор у зергов, только с возможностью строить неограниченное число юнитов. Имеет наземную и воздушную атаку.")
            this.add("Первый боец зергов, легкий тип брони, атака по земле. Могут мутировать в Гиблинга.")
            this.add("Мутирует из лингов. Доп.урон по легким единицам.")
            this.add("Дешевый, бронированный, живучий. Может мутировать в Разорителя.")
            this.add("Мутирует из таракана.")
            this.add("Универсальный юнит дальнего боя, атакующий любые цели. Может мулировать в Скрытня.")
            this.add("Атакует только по земле. Огромнейший сплеш урон.")
            this.add("Осадный юнит зерга, без базовой атаки. Вызывает саранчидов, которые атакуют только по наземным юнитам.")
            this.add("Специалист зергов.")
            this.add("Мощнейший наземный бронированный юнит зергов, атакует только по земле, имеет сплеш урон.")
            this.add("Летающий юнит зергов, атакующий любые цели.")
            this.add("Бронированная летающая единица, атакуюящая только по воздуху. Могут мутировать в брудлордов.")
            this.add("Массивная бронированная летающая единица, атакующая наземные цели.")
            this.add("Ещё один специалист зергов.")
        }
}