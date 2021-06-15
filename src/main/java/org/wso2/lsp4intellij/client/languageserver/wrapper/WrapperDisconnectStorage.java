package org.wso2.lsp4intellij.client.languageserver.wrapper;

import org.eclipse.lsp4j.Diagnostic;
import org.wso2.lsp4intellij.editor.EditorEventManager;

import java.util.List;

public class WrapperDisconnectStorage {
    private List<Diagnostic> diagnostics;

    public WrapperDisconnectStorage(EditorEventManager manager) {
        save(manager);
    }

    private void save(EditorEventManager manager) {
        this.diagnostics = manager.getDiagnostics();
    }

    public void load(EditorEventManager manager) {
        manager.diagnostics(this.diagnostics);
    }
}
