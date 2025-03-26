package a2;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import b2.InterfaceC0956b;

/* loaded from: classes.dex */
public abstract class e extends i implements InterfaceC0956b.a {

    /* renamed from: y, reason: collision with root package name */
    private Animatable f6526y;

    public e(ImageView imageView) {
        super(imageView);
    }

    private void o(Object obj) {
        if (!(obj instanceof Animatable)) {
            this.f6526y = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f6526y = animatable;
        animatable.start();
    }

    private void r(Object obj) {
        q(obj);
        o(obj);
    }

    @Override // com.bumptech.glide.manager.k
    public void a() {
        Animatable animatable = this.f6526y;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // a2.AbstractC0809a, a2.h
    public void e(Drawable drawable) {
        super.e(drawable);
        r(null);
        p(drawable);
    }

    @Override // com.bumptech.glide.manager.k
    public void f() {
        Animatable animatable = this.f6526y;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // a2.h
    public void g(Object obj, InterfaceC0956b interfaceC0956b) {
        if (interfaceC0956b == null || !interfaceC0956b.a(obj, this)) {
            r(obj);
        } else {
            o(obj);
        }
    }

    @Override // a2.i, a2.AbstractC0809a, a2.h
    public void h(Drawable drawable) {
        super.h(drawable);
        r(null);
        p(drawable);
    }

    @Override // a2.i, a2.AbstractC0809a, a2.h
    public void j(Drawable drawable) {
        super.j(drawable);
        Animatable animatable = this.f6526y;
        if (animatable != null) {
            animatable.stop();
        }
        r(null);
        p(drawable);
    }

    public void p(Drawable drawable) {
        ((ImageView) this.f6529o).setImageDrawable(drawable);
    }

    protected abstract void q(Object obj);
}
