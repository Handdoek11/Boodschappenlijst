package com.headcode.ourgroceries.android;

import android.view.View;
import com.google.android.material.snackbar.Snackbar;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes2.dex */
public abstract class V1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Queue f34571a = new ArrayDeque();

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final CharSequence f34572a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f34573b;

        public a(CharSequence charSequence, boolean z7) {
            this.f34572a = charSequence;
            this.f34573b = z7;
        }

        public CharSequence a() {
            return this.f34572a;
        }

        public boolean b() {
            return this.f34573b;
        }
    }

    private static void a(Snackbar snackbar) {
        snackbar.I().setBackgroundResource(E2.f33379C);
        snackbar.Y();
    }

    public static void b(CharSequence charSequence, boolean z7) {
        f34571a.add(new a(charSequence, z7));
    }

    public static void c(View view) {
        a aVar = (a) f34571a.poll();
        if (aVar == null) {
            return;
        }
        e(view, aVar.a(), aVar.b());
    }

    public static void d(View view, int i8, boolean z7) {
        a(Snackbar.n0(view, i8, z7 ? 0 : -1));
    }

    public static void e(View view, CharSequence charSequence, boolean z7) {
        a(Snackbar.o0(view, charSequence, z7 ? 0 : -1));
    }
}
