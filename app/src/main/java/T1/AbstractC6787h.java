package t1;

import android.content.Context;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: t1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6787h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f43818a = s1.j.f("WrkDbPathHelper");

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f43819b = {"-journal", "-shm", "-wal"};

    public static File a(Context context) {
        return c(context, "androidx.work.workdb");
    }

    public static File b(Context context) {
        return context.getDatabasePath("androidx.work.workdb");
    }

    private static File c(Context context, String str) {
        return new File(context.getNoBackupFilesDir(), str);
    }

    public static String d() {
        return "androidx.work.workdb";
    }

    public static void e(Context context) {
        if (b(context).exists()) {
            s1.j.c().a(f43818a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            Map f8 = f(context);
            for (File file : f8.keySet()) {
                File file2 = (File) f8.get(file);
                if (file.exists() && file2 != null) {
                    if (file2.exists()) {
                        s1.j.c().h(f43818a, String.format("Over-writing contents of %s", file2), new Throwable[0]);
                    }
                    s1.j.c().a(f43818a, file.renameTo(file2) ? String.format("Migrated %s to %s", file, file2) : String.format("Renaming %s to %s failed", file, file2), new Throwable[0]);
                }
            }
        }
    }

    public static Map f(Context context) {
        HashMap hashMap = new HashMap();
        File b8 = b(context);
        File a8 = a(context);
        hashMap.put(b8, a8);
        for (String str : f43819b) {
            hashMap.put(new File(b8.getPath() + str), new File(a8.getPath() + str));
        }
        return hashMap;
    }
}
