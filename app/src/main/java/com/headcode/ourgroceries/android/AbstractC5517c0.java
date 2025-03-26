package com.headcode.ourgroceries.android;

import A3.AbstractC0376j;
import A3.InterfaceC0372f;
import A3.InterfaceC0373g;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.AbstractActivityC0911j;
import java.util.List;
import q5.AbstractC6635a;
import x4.AbstractC6909a;
import x4.C6910b;

/* renamed from: com.headcode.ourgroceries.android.c0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5517c0 {

    /* renamed from: com.headcode.ourgroceries.android.c0$a */
    public enum a {
        NONE,
        ACCEPT_INVITE,
        LAUNCH_UPGRADE;

        public static a c(Uri uri) {
            if (uri == null) {
                return NONE;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.isEmpty()) {
                return NONE;
            }
            String str = pathSegments.get(0);
            str.hashCode();
            return !str.equals("launch-upgrade") ? !str.equals("accept-invite") ? NONE : ACCEPT_INVITE : LAUNCH_UPGRADE;
        }
    }

    public static void c(final AbstractActivityC0911j abstractActivityC0911j, final X1 x12) {
        AbstractC0376j a8;
        Intent intent = abstractActivityC0911j.getIntent();
        if (intent == null || (a8 = AbstractC6909a.b().a(intent)) == null) {
            return;
        }
        a8.i(abstractActivityC0911j, new InterfaceC0373g() { // from class: com.headcode.ourgroceries.android.a0
            @Override // A3.InterfaceC0373g
            public final void b(Object obj) {
                AbstractC5517c0.e(abstractActivityC0911j, x12, (C6910b) obj);
            }
        }).f(abstractActivityC0911j, new InterfaceC0372f() { // from class: com.headcode.ourgroceries.android.b0
            @Override // A3.InterfaceC0372f
            public final void e(Exception exc) {
                AbstractC5517c0.f(exc);
            }
        });
    }

    public static boolean d(Intent intent) {
        return intent.hasExtra("com.google.firebase.dynamiclinks.DYNAMIC_LINK_DATA") && intent.getData() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(AbstractActivityC0911j abstractActivityC0911j, X1 x12, C6910b c6910b) {
        Uri a8 = c6910b != null ? c6910b.a() : null;
        if (a8 == null) {
            return;
        }
        AbstractC6635a.d("OG-FDLUtils", "handle.onSuccess: deeplink: " + a8);
        int ordinal = a.c(a8).ordinal();
        if (ordinal == 1) {
            AbstractC5604n.k(abstractActivityC0911j, a8, x12);
        } else {
            if (ordinal != 2) {
                return;
            }
            AbstractC5625q.w(abstractActivityC0911j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(Exception exc) {
        AbstractC6635a.f("OG-FDLUtils", "handle.onFailure: " + exc.getMessage());
    }
}
