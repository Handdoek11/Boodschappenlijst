package com.google.firebase.crashlytics.ktx;

import J6.AbstractC0650j;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import g4.C5807c;
import java.util.List;
import y6.AbstractC6987o;

@Keep
/* loaded from: classes2.dex */
public final class FirebaseCrashlyticsKtxRegistrar implements ComponentRegistrar {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C5807c> getComponents() {
        return AbstractC6987o.e();
    }
}
