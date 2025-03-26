package m4;

import java.io.File;
import java.io.IOException;

/* renamed from: m4.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C6219z {

    /* renamed from: a, reason: collision with root package name */
    private final String f39148a;

    /* renamed from: b, reason: collision with root package name */
    private final s4.g f39149b;

    public C6219z(String str, s4.g gVar) {
        this.f39148a = str;
        this.f39149b = gVar;
    }

    private File b() {
        return this.f39149b.g(this.f39148a);
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e8) {
            j4.g.f().e("Error creating marker: " + this.f39148a, e8);
            return false;
        }
    }

    public boolean c() {
        return b().exists();
    }

    public boolean d() {
        return b().delete();
    }
}
