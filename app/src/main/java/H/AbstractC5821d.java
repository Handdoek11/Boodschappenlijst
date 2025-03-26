package h;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import h.AbstractC5819b;

/* renamed from: h.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5821d extends AbstractC5819b {

    /* renamed from: D, reason: collision with root package name */
    private a f36178D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f36179E;

    /* renamed from: h.d$a */
    static class a extends AbstractC5819b.d {

        /* renamed from: J, reason: collision with root package name */
        int[][] f36180J;

        a(a aVar, AbstractC5821d abstractC5821d, Resources resources) {
            super(aVar, abstractC5821d, resources);
            if (aVar != null) {
                this.f36180J = aVar.f36180J;
            } else {
                this.f36180J = new int[f()][];
            }
        }

        int A(int[] iArr) {
            int[][] iArr2 = this.f36180J;
            int h8 = h();
            for (int i8 = 0; i8 < h8; i8++) {
                if (StateSet.stateSetMatches(iArr2[i8], iArr)) {
                    return i8;
                }
            }
            return -1;
        }

        @Override // h.AbstractC5819b.d
        public void o(int i8, int i9) {
            super.o(i8, i9);
            int[][] iArr = new int[i9][];
            System.arraycopy(this.f36180J, 0, iArr, 0, i8);
            this.f36180J = iArr;
        }

        @Override // h.AbstractC5819b.d
        abstract void r();

        int z(int[] iArr, Drawable drawable) {
            int a8 = a(drawable);
            this.f36180J[a8] = iArr;
            return a8;
        }
    }

    AbstractC5821d(a aVar) {
        if (aVar != null) {
            h(aVar);
        }
    }

    @Override // h.AbstractC5819b, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // h.AbstractC5819b
    void h(AbstractC5819b.d dVar) {
        super.h(dVar);
        if (dVar instanceof a) {
            this.f36178D = (a) dVar;
        }
    }

    int[] j(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i8 = 0;
        for (int i9 = 0; i9 < attributeCount; i9++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i9);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i10 = i8 + 1;
                if (!attributeSet.getAttributeBooleanValue(i9, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i8] = attributeNameResource;
                i8 = i10;
            }
        }
        return StateSet.trimStateSet(iArr, i8);
    }

    @Override // h.AbstractC5819b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f36179E && super.mutate() == this) {
            this.f36178D.r();
            this.f36179E = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected abstract boolean onStateChange(int[] iArr);
}
