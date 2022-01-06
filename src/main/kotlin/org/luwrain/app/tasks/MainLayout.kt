
package org.luwrain.app.tasks

import org.luwrain.core.*
import org.luwrain.core.events.*
import org.luwrain.controls.*
import org.luwrain.app.base.*
import org.luwrain.io.json.*

class MainLayout: LayoutBase {
    val area : ListArea<PersonalTask>

    constructor(app: App): super(app)  {
	this.area = ListArea(listParams({params ->
	params.model = ListUtils.ListModel(app.tasks)
	params.name = "Личные задачи";
	}));
	setAreaLayout(area, null);
    }
}
