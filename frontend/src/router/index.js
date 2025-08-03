import { createRouter, createWebHashHistory } from 'vue-router';

const router = createRouter({
  history: createWebHashHistory(),
  routes: [
    {
      path: '/',
      component: () => import('../components/pages/Index.vue'),
    },
    {
      path: '/users',
      component: () => import('../components/ui/UserGrid.vue'),
    },
    {
      path: '/posts',
      component: () => import('../components/ui/PostGrid.vue'),
    },
    {
      path: '/projectManagements',
      component: () => import('../components/ui/ProjectManagementGrid.vue'),
    },
    {
      path: '/invitationManagements',
      component: () => import('../components/InvitationManagementView.vue'),
    },
    {
      path: '/attachments',
      component: () => import('../components/ui/AttachmentGrid.vue'),
    },
    {
      path: '/comments',
      component: () => import('../components/ui/CommentGrid.vue'),
    },
    {
      path: '/invites',
      component: () => import('../components/ui/InviteGrid.vue'),
    },
  ],
})

export default router;
