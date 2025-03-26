package P1;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class u implements J1.d {

    /* renamed from: a, reason: collision with root package name */
    private final M1.b f4385a;

    public u(M1.b bVar) {
        this.f4385a = bVar;
    }

    @Override // J1.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(InputStream inputStream, File file, J1.h hVar) {
        byte[] bArr = (byte[]) this.f4385a.e(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, read);
                    } catch (IOException e8) {
                        e = e8;
                        fileOutputStream = fileOutputStream2;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        this.f4385a.d(bArr);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        this.f4385a.d(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                this.f4385a.d(bArr);
                return true;
            } catch (IOException e9) {
                e = e9;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
