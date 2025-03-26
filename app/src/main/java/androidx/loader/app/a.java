package androidx.loader.app;

import androidx.lifecycle.InterfaceC0927m;
import androidx.lifecycle.L;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class a {
    public static a b(InterfaceC0927m interfaceC0927m) {
        return new b(interfaceC0927m, ((L) interfaceC0927m).getViewModelStore());
    }

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void c();
}
