#!/bin/sh

TEMPLATE_ZIP=../org.applause.applausedsl.ui/src-gen/org/applause/applausedsl/ui/wizard/template.zip
rm $TEMPLATE_ZIP
zip -r $TEMPLATE_ZIP * -x "*.sh" "build/*" "Generated/*" .DS_Store "*.zip" "*.pbxuser" "*.perspectivev3"