
package org.luwrain.app.tasks

import java.util.*

import org.luwrain.core.*
import org.luwrain.app.base.*
import org.luwrain.io.json.*

class App: AppBase<Strings>("luwrain.tasks", Strings::class.java) {
    private lateinit var mainLayout: MainLayout
    var tasks = ArrayList<PersonalTask>()

override fun onAppInit(): AreaLayout {
this.mainLayout = MainLayout(this)
setAppName(getStrings().appName())
return mainLayout.getAreaLayout()
}

override fun onEscape(): Boolean {
closeApp()
return true
}
}
