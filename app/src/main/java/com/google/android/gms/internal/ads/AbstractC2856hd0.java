package com.google.android.gms.internal.ads;

import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.hd0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2856hd0 {
    public static File a(File file, boolean z7) {
        if (z7 && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File b(String str, String str2, File file) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new File(c(str, file), str2);
    }

    public static File c(String str, File file) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        a(file2, false);
        return file2;
    }

    public static boolean d(File file) {
        boolean z7;
        if (!file.exists()) {
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            z7 = true;
            for (int i8 = 0; i8 < listFiles.length; i8++) {
                File file2 = listFiles[i8];
                z7 = file2 != null && d(file2) && z7;
            }
        } else {
            z7 = true;
        }
        return file.delete() && z7;
    }

    public static boolean e(File file, byte[] bArr) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (IOException unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (Build.VERSION.SDK_INT >= 34) {
                file.setReadOnly();
            }
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
            f3.k.a(fileOutputStream);
            return true;
        } catch (IOException unused2) {
            fileOutputStream2 = fileOutputStream;
            f3.k.a(fileOutputStream2);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            f3.k.a(fileOutputStream2);
            throw th;
        }
    }
}
