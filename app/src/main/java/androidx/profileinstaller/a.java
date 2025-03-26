package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;

/* loaded from: classes.dex */
abstract class a {

    /* renamed from: androidx.profileinstaller.a$a, reason: collision with other inner class name */
    private static class C0179a {
        static File a(Context context) {
            return context.getCodeCacheDir();
        }
    }

    private static class b {
        static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }
    }

    static boolean a(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z7 = true;
        for (File file2 : listFiles) {
            z7 = a(file2) && z7;
        }
        return z7;
    }

    static void b(Context context, ProfileInstallReceiver.a aVar) {
        int i8 = Build.VERSION.SDK_INT;
        if (a(i8 >= 34 ? b.a(context).getCacheDir() : i8 >= 24 ? C0179a.a(b.a(context)) : i8 == 23 ? C0179a.a(context) : context.getCacheDir())) {
            aVar.b(14, null);
        } else {
            aVar.b(15, null);
        }
    }
}
