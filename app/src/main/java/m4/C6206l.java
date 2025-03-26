package m4;

import j$.util.Objects;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: m4.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C6206l {

    /* renamed from: d, reason: collision with root package name */
    private static final FilenameFilter f39071d = new FilenameFilter() { // from class: m4.j
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return C6206l.d(file, str);
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private static final Comparator f39072e = new Comparator() { // from class: m4.k
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C6206l.e((File) obj, (File) obj2);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final s4.g f39073a;

    /* renamed from: b, reason: collision with root package name */
    private String f39074b = null;

    /* renamed from: c, reason: collision with root package name */
    private String f39075c = null;

    C6206l(s4.g gVar) {
        this.f39073a = gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean d(File file, String str) {
        return str.startsWith("aqs.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int e(File file, File file2) {
        return Long.compare(file2.lastModified(), file.lastModified());
    }

    private static void f(s4.g gVar, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            gVar.q(str, "aqs." + str2).createNewFile();
        } catch (IOException e8) {
            j4.g.f().l("Failed to persist App Quality Sessions session id.", e8);
        }
    }

    static String g(s4.g gVar, String str) {
        List r8 = gVar.r(str, f39071d);
        if (!r8.isEmpty()) {
            return ((File) Collections.min(r8, f39072e)).getName().substring(4);
        }
        j4.g.f().k("Unable to read App Quality Sessions session id.");
        return null;
    }

    public synchronized String c(String str) {
        if (Objects.equals(this.f39074b, str)) {
            return this.f39075c;
        }
        return g(this.f39073a, str);
    }

    public synchronized void h(String str) {
        if (!Objects.equals(this.f39075c, str)) {
            f(this.f39073a, this.f39074b, str);
            this.f39075c = str;
        }
    }

    public synchronized void i(String str) {
        if (!Objects.equals(this.f39074b, str)) {
            f(this.f39073a, str, this.f39075c);
            this.f39074b = str;
        }
    }
}
