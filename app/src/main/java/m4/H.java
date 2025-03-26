package m4;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import p4.AbstractC6384F;

/* loaded from: classes2.dex */
class H implements M {

    /* renamed from: a, reason: collision with root package name */
    private final File f39003a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39004b;

    /* renamed from: c, reason: collision with root package name */
    private final String f39005c;

    H(String str, String str2, File file) {
        this.f39004b = str;
        this.f39005c = str2;
        this.f39003a = file;
    }

    private byte[] d() {
        byte[] bArr = new byte[8192];
        try {
            InputStream b8 = b();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    if (b8 == null) {
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        if (b8 != null) {
                            b8.close();
                        }
                        return null;
                    }
                    while (true) {
                        try {
                            int read = b8.read(bArr);
                            if (read <= 0) {
                                gZIPOutputStream.finish();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                gZIPOutputStream.close();
                                byteArrayOutputStream.close();
                                b8.close();
                                return byteArray;
                            }
                            gZIPOutputStream.write(bArr, 0, read);
                        } finally {
                        }
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // m4.M
    public String a() {
        return this.f39005c;
    }

    @Override // m4.M
    public InputStream b() {
        if (this.f39003a.exists() && this.f39003a.isFile()) {
            try {
                return new FileInputStream(this.f39003a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    @Override // m4.M
    public AbstractC6384F.d.b c() {
        byte[] d8 = d();
        if (d8 != null) {
            return AbstractC6384F.d.b.a().b(d8).c(this.f39004b).a();
        }
        return null;
    }
}
