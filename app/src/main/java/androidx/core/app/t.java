package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import o0.AbstractC6278a;

/* loaded from: classes.dex */
public final class t implements Iterable {

    /* renamed from: o, reason: collision with root package name */
    private final ArrayList f9187o = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    private final Context f9188s;

    public interface a {
        Intent getSupportParentActivityIntent();
    }

    private t(Context context) {
        this.f9188s = context;
    }

    public static t e(Context context) {
        return new t(context);
    }

    public t b(Intent intent) {
        this.f9187o.add(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t c(Activity activity) {
        Intent supportParentActivityIntent = activity instanceof a ? ((a) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = i.a(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f9188s.getPackageManager());
            }
            d(component);
            b(supportParentActivityIntent);
        }
        return this;
    }

    public t d(ComponentName componentName) {
        int size = this.f9187o.size();
        try {
            Intent b8 = i.b(this.f9188s, componentName);
            while (b8 != null) {
                this.f9187o.add(size, b8);
                b8 = i.b(this.f9188s, b8.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e8) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e8);
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f9187o.iterator();
    }

    public void j() {
        n(null);
    }

    public void n(Bundle bundle) {
        if (this.f9187o.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f9187o.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (AbstractC6278a.m(this.f9188s, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f9188s.startActivity(intent);
    }
}
