package s4;

import android.content.Context;
import j4.j;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import m4.AbstractC6203i;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    final String f42737a;

    /* renamed from: b, reason: collision with root package name */
    private final File f42738b;

    /* renamed from: c, reason: collision with root package name */
    private final File f42739c;

    /* renamed from: d, reason: collision with root package name */
    private final File f42740d;

    /* renamed from: e, reason: collision with root package name */
    private final File f42741e;

    /* renamed from: f, reason: collision with root package name */
    private final File f42742f;

    /* renamed from: g, reason: collision with root package name */
    private final File f42743g;

    public g(Context context) {
        String str;
        String d8 = j.f38249a.e(context).d();
        this.f42737a = d8;
        File filesDir = context.getFilesDir();
        this.f42738b = filesDir;
        if (y()) {
            str = ".crashlytics.v3" + File.separator + x(d8);
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File t7 = t(new File(filesDir, str));
        this.f42739c = t7;
        this.f42740d = t(new File(t7, "open-sessions"));
        this.f42741e = t(new File(t7, "reports"));
        this.f42742f = t(new File(t7, "priority-reports"));
        this.f42743g = t(new File(t7, "native-reports"));
    }

    private void b(String str) {
        File file = new File(this.f42738b, str);
        if (file.exists() && v(file)) {
            j4.g.f().b("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    private void c(final String str) {
        String[] list;
        if (!this.f42738b.exists() || (list = this.f42738b.list(new FilenameFilter() { // from class: s4.f
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return g.s(str, file, str2);
            }
        })) == null) {
            return;
        }
        for (String str2 : list) {
            b(str2);
        }
    }

    private File p(String str) {
        return u(new File(this.f42740d, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean s(String str, File file, String str2) {
        return str2.startsWith(str);
    }

    private static synchronized File t(File file) {
        synchronized (g.class) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        return file;
                    }
                    j4.g.f().b("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                    file.delete();
                }
                if (!file.mkdirs()) {
                    j4.g.f().d("Could not create Crashlytics-specific directory: " + file);
                }
                return file;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static File u(File file) {
        file.mkdirs();
        return file;
    }

    static boolean v(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                v(file2);
            }
        }
        return file.delete();
    }

    private static List w(Object[] objArr) {
        return objArr == null ? Collections.emptyList() : Arrays.asList(objArr);
    }

    static String x(String str) {
        return str.length() > 40 ? AbstractC6203i.z(str) : str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    private boolean y() {
        return !this.f42737a.isEmpty();
    }

    public void d() {
        b(".com.google.firebase.crashlytics");
        b(".com.google.firebase.crashlytics-ndk");
        if (y()) {
            b(".com.google.firebase.crashlytics.files.v1");
            c(".com.google.firebase.crashlytics.files.v2" + File.pathSeparator);
        }
    }

    public boolean e(String str) {
        return v(new File(this.f42740d, str));
    }

    public List f() {
        return w(this.f42740d.list());
    }

    public File g(String str) {
        return new File(this.f42739c, str);
    }

    public List h(FilenameFilter filenameFilter) {
        return w(this.f42739c.listFiles(filenameFilter));
    }

    public File i(String str) {
        return new File(this.f42743g, str);
    }

    public List j() {
        return w(this.f42743g.listFiles());
    }

    public File k(String str) {
        return u(new File(p(str), "native"));
    }

    public File l(String str) {
        return new File(this.f42742f, str);
    }

    public List m() {
        return w(this.f42742f.listFiles());
    }

    public File n(String str) {
        return new File(this.f42741e, str);
    }

    public List o() {
        return w(this.f42741e.listFiles());
    }

    public File q(String str, String str2) {
        return new File(p(str), str2);
    }

    public List r(String str, FilenameFilter filenameFilter) {
        return w(p(str).listFiles(filenameFilter));
    }
}
