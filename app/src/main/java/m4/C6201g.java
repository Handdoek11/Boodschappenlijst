package m4;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import p4.AbstractC6384F;

/* renamed from: m4.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C6201g implements M {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f39052a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39053b;

    /* renamed from: c, reason: collision with root package name */
    private final String f39054c;

    C6201g(String str, String str2, byte[] bArr) {
        this.f39053b = str;
        this.f39054c = str2;
        this.f39052a = bArr;
    }

    private byte[] d() {
        if (e()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(this.f39052a);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    private boolean e() {
        byte[] bArr = this.f39052a;
        return bArr == null || bArr.length == 0;
    }

    @Override // m4.M
    public String a() {
        return this.f39054c;
    }

    @Override // m4.M
    public InputStream b() {
        if (e()) {
            return null;
        }
        return new ByteArrayInputStream(this.f39052a);
    }

    @Override // m4.M
    public AbstractC6384F.d.b c() {
        byte[] d8 = d();
        if (d8 == null) {
            return null;
        }
        return AbstractC6384F.d.b.a().b(d8).c(this.f39053b).a();
    }
}
