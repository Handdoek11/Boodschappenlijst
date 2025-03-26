package t5;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: t5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6799a {
    public static void a(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static BufferedInputStream b(File file, int i8) {
        return new BufferedInputStream(new FileInputStream(file), i8);
    }
}
