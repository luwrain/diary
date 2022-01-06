
package org.luwrain.app.diary

import org.luwrain.core.*

class Extension: EmptyExtension() {
    override fun getCommands(luwrain: Luwrain): Array<Command> {
	return arrayOf(SimpleShortcutCommand("tasks"))
    }

    override fun getExtObjects(luwrain: Luwrain): Array<ExtensionObject> {
	return arrayOf(SimpleShortcut("tasks", org.luwrain.app.tasks.App::class.java))
    }

    override fun i18nExtension(luwrain: Luwrain, i18n: org.luwrain.i18n.I18nExtension) {
	i18n.addCommandTitle("en", "tasks", "Personal tasks")
	i18n.addCommandTitle("ru", "еtasks", "Личные дела")
	i18n.addStrings("en", "luwrain.tasks", org.luwrain.app.tasks.Strings())
	i18n.addStrings("ru", "luwrain.tasks", org.luwrain.app.tasks.Strings())
    }
}
