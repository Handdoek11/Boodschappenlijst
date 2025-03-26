package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final M0.b f9694a;

    /* renamed from: b, reason: collision with root package name */
    private final char[] f9695b;

    /* renamed from: c, reason: collision with root package name */
    private final a f9696c = new a(1024);

    /* renamed from: d, reason: collision with root package name */
    private final Typeface f9697d;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final SparseArray f9698a;

        /* renamed from: b, reason: collision with root package name */
        private p f9699b;

        private a() {
            this(1);
        }

        a a(int i8) {
            SparseArray sparseArray = this.f9698a;
            if (sparseArray == null) {
                return null;
            }
            return (a) sparseArray.get(i8);
        }

        final p b() {
            return this.f9699b;
        }

        void c(p pVar, int i8, int i9) {
            a a8 = a(pVar.b(i8));
            if (a8 == null) {
                a8 = new a();
                this.f9698a.put(pVar.b(i8), a8);
            }
            if (i9 > i8) {
                a8.c(pVar, i8 + 1, i9);
            } else {
                a8.f9699b = pVar;
            }
        }

        a(int i8) {
            this.f9698a = new SparseArray(i8);
        }
    }

    private n(Typeface typeface, M0.b bVar) {
        this.f9697d = typeface;
        this.f9694a = bVar;
        this.f9695b = new char[bVar.k() * 2];
        a(bVar);
    }

    private void a(M0.b bVar) {
        int k8 = bVar.k();
        for (int i8 = 0; i8 < k8; i8++) {
            p pVar = new p(this, i8);
            Character.toChars(pVar.f(), this.f9695b, i8 * 2);
            h(pVar);
        }
    }

    public static n b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            v0.u.a("EmojiCompat.MetadataRepo.create");
            return new n(typeface, m.b(byteBuffer));
        } finally {
            v0.u.b();
        }
    }

    public char[] c() {
        return this.f9695b;
    }

    public M0.b d() {
        return this.f9694a;
    }

    int e() {
        return this.f9694a.l();
    }

    a f() {
        return this.f9696c;
    }

    Typeface g() {
        return this.f9697d;
    }

    void h(p pVar) {
        y0.i.h(pVar, "emoji metadata cannot be null");
        y0.i.b(pVar.c() > 0, "invalid metadata codepoint length");
        this.f9696c.c(pVar, 0, pVar.c() - 1);
    }
}
