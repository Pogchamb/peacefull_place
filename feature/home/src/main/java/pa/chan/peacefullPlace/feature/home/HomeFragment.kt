package pa.chan.peacefullPlace.feature.home

import android.os.Bundle
import android.view.View
import pa.chan.peacefullPlace.core.common.BaseFragment
import pa.chan.peacefullPlace.feature.home.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.test.text = "qqqqq"
    }
}