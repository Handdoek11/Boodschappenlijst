package H2;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* loaded from: classes.dex */
public abstract class s {
    public static Context a(Context context) {
        return c(context).b();
    }

    public static Object b(Context context, String str, r rVar) {
        try {
            return rVar.a(c(context).d(str));
        } catch (Exception e8) {
            throw new zzr(e8);
        }
    }

    private static DynamiteModule c(Context context) {
        try {
            return DynamiteModule.e(context, DynamiteModule.f13442b, ModuleDescriptor.MODULE_ID);
        } catch (Exception e8) {
            throw new zzr(e8);
        }
    }
}
