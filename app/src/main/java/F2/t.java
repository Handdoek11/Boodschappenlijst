package F2;

import G2.D0;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* loaded from: classes.dex */
final class t extends G2.B {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ x f2280c;

    /* synthetic */ t(x xVar, u uVar) {
        this.f2280c = xVar;
    }

    @Override // G2.B
    public final void a() {
        final BitmapDrawable bitmapDrawable;
        Bitmap a8 = C2.v.y().a(Integer.valueOf(this.f2280c.f2296s.f13075F.f792w));
        if (a8 != null) {
            C2.v.t();
            x xVar = this.f2280c;
            C2.l lVar = xVar.f2296s.f13075F;
            boolean z7 = lVar.f790u;
            float f8 = lVar.f791v;
            Activity activity = xVar.f2295o;
            if (!z7 || f8 <= 0.0f || f8 > 25.0f) {
                bitmapDrawable = new BitmapDrawable(activity.getResources(), a8);
            } else {
                try {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(a8, a8.getWidth(), a8.getHeight(), false);
                    Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
                    RenderScript create = RenderScript.create(activity);
                    ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                    Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
                    Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
                    create2.setRadius(f8);
                    create2.setInput(createFromBitmap);
                    create2.forEach(createFromBitmap2);
                    createFromBitmap2.copyTo(createBitmap);
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), createBitmap);
                } catch (RuntimeException unused) {
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), a8);
                }
            }
            D0.f2566l.post(new Runnable() { // from class: F2.s
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2278o.f2280c.f2295o.getWindow().setBackgroundDrawable(bitmapDrawable);
                }
            });
        }
    }
}
