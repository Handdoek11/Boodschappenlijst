package v0;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;

/* renamed from: v0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6823b {

    /* renamed from: a, reason: collision with root package name */
    public static final C6823b f44055a = new C6823b();

    private C6823b() {
    }

    public static final void a(Bundle bundle, String str, Size size) {
        bundle.putSize(str, size);
    }

    public static final void b(Bundle bundle, String str, SizeF sizeF) {
        bundle.putSizeF(str, sizeF);
    }
}
