package G6;

import J6.r;
import S6.h;
import java.io.File;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class f extends e {
    public static String a(File file) {
        r.e(file, "<this>");
        String name = file.getName();
        r.d(name, "getName(...)");
        return h.v0(name, '.', "");
    }
}
