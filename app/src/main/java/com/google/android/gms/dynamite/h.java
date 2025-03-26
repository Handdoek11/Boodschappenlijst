package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
final class h implements DynamiteModule.a {
    h() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.a
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.InterfaceC0229a interfaceC0229a) {
        int a8;
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        int b8 = interfaceC0229a.b(context, str);
        bVar.f13460a = b8;
        int i8 = 1;
        int i9 = 0;
        if (b8 != 0) {
            a8 = interfaceC0229a.a(context, str, false);
            bVar.f13461b = a8;
        } else {
            a8 = interfaceC0229a.a(context, str, true);
            bVar.f13461b = a8;
        }
        int i10 = bVar.f13460a;
        if (i10 == 0) {
            if (a8 == 0) {
                i8 = 0;
            }
            bVar.f13462c = i8;
            return bVar;
        }
        i9 = i10;
        if (i9 >= a8) {
            i8 = -1;
        }
        bVar.f13462c = i8;
        return bVar;
    }
}
