package com.google.android.gms.internal.wearable;

import B3.C0390i;
import android.os.ParcelFileDescriptor;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class z1 {
    /* JADX WARN: Multi-variable type inference failed */
    public static File a(ParcelFileDescriptor parcelFileDescriptor, File file) {
        IOException e8;
        FileOutputStream fileOutputStream;
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        try {
            file.mkdirs();
            File createTempFile = File.createTempFile("asset", ".tmp", file);
            C0390i c0390i = 0;
            try {
                try {
                    fileOutputStream = new FileOutputStream(createTempFile);
                } catch (IOException e9) {
                    e8 = e9;
                } catch (Throwable th) {
                    th = th;
                    b(autoCloseInputStream);
                    b(c0390i);
                    createTempFile.delete();
                    throw th;
                }
                try {
                    byte[] bArr = new byte[10240];
                    while (true) {
                        int read = autoCloseInputStream.read(bArr);
                        if (read < 0) {
                            b(autoCloseInputStream);
                            b(fileOutputStream);
                            return createTempFile;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                } catch (IOException e10) {
                    e8 = e10;
                    throw new RuntimeException(e8);
                }
            } catch (Throwable th2) {
                th = th2;
                c0390i = ".tmp";
                b(autoCloseInputStream);
                b(c0390i);
                createTempFile.delete();
                throw th;
            }
        } finally {
            b(autoCloseInputStream);
        }
    }

    private static void b(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }
}
