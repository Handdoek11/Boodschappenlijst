package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
class p implements LayoutInflater.Factory2 {

    /* renamed from: o, reason: collision with root package name */
    final w f10111o;

    class a implements View.OnAttachStateChangeListener {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ C f10112o;

        a(C c8) {
            this.f10112o = c8;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment k8 = this.f10112o.k();
            this.f10112o.m();
            K.n((ViewGroup) k8.f9884Z.getParent(), p.this.f10111o).j();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    p(w wVar) {
        this.f10111o = wVar;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C v7;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f10111o);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, O0.c.f4230a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(O0.c.f4231b);
        }
        int resourceId = obtainStyledAttributes.getResourceId(O0.c.f4232c, -1);
        String string = obtainStyledAttributes.getString(O0.c.f4233d);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !n.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment g02 = resourceId != -1 ? this.f10111o.g0(resourceId) : null;
        if (g02 == null && string != null) {
            g02 = this.f10111o.h0(string);
        }
        if (g02 == null && id != -1) {
            g02 = this.f10111o.g0(id);
        }
        if (g02 == null) {
            g02 = this.f10111o.r0().a(context.getClassLoader(), attributeValue);
            g02.f9864F = true;
            g02.f9873O = resourceId != 0 ? resourceId : id;
            g02.f9874P = id;
            g02.f9875Q = string;
            g02.f9865G = true;
            w wVar = this.f10111o;
            g02.f9869K = wVar;
            g02.f9870L = wVar.t0();
            g02.V0(this.f10111o.t0().f(), attributeSet, g02.f9904s);
            v7 = this.f10111o.j(g02);
            if (w.G0(2)) {
                Log.v("FragmentManager", "Fragment " + g02 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            if (g02.f9865G) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            g02.f9865G = true;
            w wVar2 = this.f10111o;
            g02.f9869K = wVar2;
            g02.f9870L = wVar2.t0();
            g02.V0(this.f10111o.t0().f(), attributeSet, g02.f9904s);
            v7 = this.f10111o.v(g02);
            if (w.G0(2)) {
                Log.v("FragmentManager", "Retained Fragment " + g02 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        P0.b.g(g02, viewGroup);
        g02.f9883Y = viewGroup;
        v7.m();
        v7.j();
        View view2 = g02.f9884Z;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (g02.f9884Z.getTag() == null) {
            g02.f9884Z.setTag(string);
        }
        g02.f9884Z.addOnAttachStateChangeListener(new a(v7));
        return g02.f9884Z;
    }
}
